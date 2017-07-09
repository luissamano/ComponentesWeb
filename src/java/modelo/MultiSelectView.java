/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
/**
 *
 * @author marti
 */

@ManagedBean
public class MultiSelectView {
    
    private List<SelectItem> categories;    
    private String selection;
    
    
    public MultiSelectView() {
        categories = new ArrayList<SelectItem>();
        SelectItemGroup group1 = new SelectItemGroup("Dogde");
        SelectItemGroup group2 = new SelectItemGroup("Ford");
        SelectItemGroup group3 = new SelectItemGroup("Plymouth");
        SelectItemGroup group4 = new SelectItemGroup("Chrysller");
         
        SelectItemGroup group11 = new SelectItemGroup("Deportivo");
        SelectItemGroup group12 = new SelectItemGroup("Famiiar");
         
        SelectItemGroup group21 = new SelectItemGroup("Mustang");
         
        SelectItem option31 = new SelectItem("Barracuda", "Barracuda");
        SelectItem option32 = new SelectItem("SuperBrid", "SuperBrid");
        SelectItem option33 = new SelectItem("Valiant", "Valiant Dubster");
        SelectItem option34 = new SelectItem("Roadrunner", "Roadrunner");
         
        SelectItem option41 = new SelectItem("Charger", "Charger");        
        SelectItem option42 = new SelectItem("Challenger", "Challenger");
         
        SelectItem option111 = new SelectItem("Camaro V6");
        SelectItem option112 = new SelectItem("Caamro V8");
        group11.setSelectItems(new SelectItem[]{option111, option112});
         
        SelectItem option121 = new SelectItem("Spark", "Equipado");
        SelectItem option122 = new SelectItem("Fiesta", "Equipado");
        group12.setSelectItems(new SelectItem[]{option121, option122});
         
        group1.setSelectItems(new SelectItem[]{group11, group12});
        group2.setSelectItems(new SelectItem[]{group21});
        group3.setSelectItems(new SelectItem[]{option31, option32, option33, option34});
        group4.setSelectItems(new SelectItem[]{option41, option42});
         
        categories.add(group1);
        categories.add(group2);
        categories.add(group3);
        categories.add(group4);
    }
     
    public List<SelectItem> getCategories() {
        return categories;
    }    
 
    public String getSelection() {
        return selection;
    }
    public void setSelection(String selection) {
        this.selection = selection;
    }
    
}
