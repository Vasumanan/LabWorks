package com.cg.libmgmt.DAOImpl;
import java.util.*;
import com.cg.libmgmt.DAO.ItemDAO;
import com.cg.libmgmt.domain.Item;

public class ItemDAOImpl implements ItemDAO{
	private List<Item>localRepository;
	public ItemDAOImpl() {
		localRepository = new ArrayList<Item>();
	}
	@Override
	public void saveItem(Item item) {
		localRepository.add(item);
	}
	@Override
	public List<Item> getList() {
		return localRepository;
	}

}
