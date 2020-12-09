package sh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sh.entities.Menu;
import sh.repository.MenuRepo;

@Service
public class MenuService {
	@Autowired
	private MenuRepo menuRepo;

	public Menu addOrUpdateItem(Menu b) {
		return menuRepo.save(b);
	}


	public void delItemById(int id) {
		menuRepo.deleteById(id);
	}

	public Menu findItem(int id) {
		return menuRepo.findById(id).get();
	}

	public List<Menu> findItems() {
		return menuRepo.findAll();
	}


}
