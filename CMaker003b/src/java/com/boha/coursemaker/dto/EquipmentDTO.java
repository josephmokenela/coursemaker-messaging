/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boha.coursemaker.dto;

import com.boha.coursemaker.data.Equipment;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class EquipmentDTO {

    private int equipmentID;
    private String equipmentName;
    private int companyID;
    private List<InventoryDTO> inventoryList;

    public EquipmentDTO(Equipment a) {
        equipmentID = a.getEquipmentID();
        companyID = a.getCompany().getCompanyID();
        equipmentName = a.getEquipmentName();
        
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(int equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public List<InventoryDTO> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<InventoryDTO> inventoryList) {
        this.inventoryList = inventoryList;
    }

   
}
