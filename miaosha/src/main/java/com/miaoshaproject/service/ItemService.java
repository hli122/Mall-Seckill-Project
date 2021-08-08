package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {

    // create item
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    // item list view
    List<ItemModel> listItem();

    // get item info
    ItemModel getItemById(Integer id);

}
