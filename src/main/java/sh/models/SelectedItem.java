package sh.models;

import java.util.Arrays;

public class SelectedItem {
	private String[] item; 
	public SelectedItem() {
		this.item = new String[0];
	}
	public String[] getItem() {
		return item;
	}
	public void setItem(String[] item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "SelectedItem [Item=" + Arrays.toString(item) + "]";
	}
}
