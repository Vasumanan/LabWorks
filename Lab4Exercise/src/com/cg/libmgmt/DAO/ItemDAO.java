package com.cg.libmgmt.DAO;
import java.util.*;
import com.cg.libmgmt.domain.Item;
/**
 * This ItemDAO Interface will perform Database(Local Repository)related Operation of Item(BOOK,JOURNAL,CD,VIDEO)
 * @author Vasumanan J
 *
 */
public interface ItemDAO {
	/**
	 * This saveItem method will Save the Item(BOOK,JOURNAL,CD,VIDEO) object in the Local Repository
	 * @param item it is the Object (BOOK,JOURNAL,CD,VIDEO) which is to stored in the Local Repository
	 */
	public void saveItem(Item item);
	
	/**
	 * This getList method will return the Item List stored in the Local Repository
	 */
	public List<Item> getList();
}
