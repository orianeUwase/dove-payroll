package com.dovePayroll.models;

import java.util.ArrayList;

import com.dovePayroll.doveTypes.TaxRegion;

public class Model_tax_region extends DBConnect {
	private int[] addTaxRegion(TaxRegion region) {
		return null; // return the regionId and status
	}
	
	private int updateTaxRegion(TaxRegion region) {
		return 1; // return an integer value representing the status of the update
	}
	
	private int deleteTaxRegion(int regionID) {
		return 1; // return an integer value representing the deletion status
	}
	
	private TaxRegion getTaxRegion(int regionID) {
		return null; // return the tax region object
	}
	
	public static ArrayList<TaxRegion> getAllTaxRegion(){
		return null; // return an array list of TaxRegion objects
	}
}
