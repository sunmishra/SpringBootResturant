package sh.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sh.entities.Menu;
import sh.models.SelectedItem;
import sh.services.MenuService;

@RestController
public class MenuControllerImpl {

	@Autowired
	private MenuService menuService;


	@GetMapping("/getItems")
	public List<Menu> getItems() {
		List<Menu> itemList = menuService.findItems();
		return itemList;
	}
	
	@GetMapping("/getItem/{id}")
	public Menu getItem(@PathVariable int id) {
		Menu m = menuService.findItem(id);
		return m;
	}

	@PostMapping("/addItem")
	private int saveItem(@RequestBody Menu menu) {
		menuService.addOrUpdateItem(menu);
		return menu.getId();
	}
	
	@DeleteMapping("/removeItem/{id}")
	public void removeItem(@PathVariable int id) {
		menuService.delItemById(id);
	}
	
	@RequestMapping("/addCart")
	public String addToCart(SelectedItem selectedmenus, HttpSession session) {
		List<Integer> cart = (List<Integer>) session.getAttribute("cart"); 
		for(String menuId : selectedmenus.getItem()) {
			int id = Integer.parseInt(menuId);
			cart.add(id);
		}
		return "forward:getItem";
	}

	

	@RequestMapping("/showcart")
	public String showCart(Model model, HttpSession session) {
		List<Menu> menuList = new ArrayList<Menu>();
		List<Integer> cart = (List<Integer>) session.getAttribute("cart");
		for(int id : cart) {
			Menu m = menuService.findItem(id);
			menuList.add(m);
		}
		model.addAttribute("menuList", menuList);
		return "cart";


	}

}




