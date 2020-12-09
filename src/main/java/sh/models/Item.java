package sh.models;

public class Item {
	private String item;//field name should match the path provided in the subject.jsp
	public Item() {
	}
	public Item(String item) {
		this.item = item;//this will give represent the default selected data in the view
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Item [item=" + item + "]";
	}
}
