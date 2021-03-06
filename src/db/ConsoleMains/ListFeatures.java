package db.ConsoleMains;

import java.io.IOException;
import java.util.List;

import db.jdbc.SQLManager;
import db.pojos.Maintenance;
import db.pojos.Utility;

public class ListFeatures {

public static void main(String args[]) throws IOException {
		
		SQLManager manager = new SQLManager();
		boolean everything_ok = manager.Stablish_connection();

			System.out.println("-----------> FEATURES LIST <-----------");
			List<Utility> utilities_list = manager.List_all_utilities();
			for (Utility utility : utilities_list) {
				System.out.print(utility + "\n\n");
	        }
			
			List<Maintenance> list = manager.List_all_maintenances();
			for (Maintenance maint : list) {
				System.out.print(maint + "\n\n");
	        }
	}	
}
