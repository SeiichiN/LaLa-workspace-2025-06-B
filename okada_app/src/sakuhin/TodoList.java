package sakuhin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList{
		private List<TodoItem> items;
		
		public TodoList() {
		items = new ArrayList<>();
		}
		
		public void addItem(TodoItem item) {
			items.add(item);
		}
		
		public boolean removeItem(int id) {
			Iterator<TodoItem> it = items.iterator();
			while(it.hasNext()) {
				TodoItem item = it.next();
				if(item.getId() == id) {
					it.remove();
					return true;
				}
			}
			return false;
		}

		public List<TodoItem> getAllItems() {
			return new ArrayList<>(items);
		}
	
}
