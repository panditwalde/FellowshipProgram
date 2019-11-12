/******************************************************************************
 *  Compilation:  javac -d bin JdbcCurd.java
 *  Execution:    java -cp bin com.bridgelabz.Utility.add
 *                java -cp bin com.bridgelabz.Utility.show
 *                java -cp bin com.bridgelabz.Utility.delete
 *                java -cp bin com.bridgelabz.Utility.update
 *                java -cp bin com.bridgelabz.Utility.search
 *                
 *               
 *  
 *  Purpose:     perform all operaton using jdbc
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   6-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.jdbc;

public class JdbcCurd {

	public static void main(String[] args) throws Exception {

		try {
			int ch;
			do {
				System.out.println("1.Add ");
				System.out.println("2.Show");
				System.out.println("3.delete");
				System.out.println("4.update");
				System.out.println("5.Search");
				System.out.println("6.Exit");
				System.out.println("Enter your choice");
				ch = Utility.readinteger();

				switch (ch) {

				case 1:
					Utility.add();
					break;
				case 2:
					Utility.show();
					break;
				case 3:
					Utility.delete();
					break;
				case 4:
					Utility.update();
					break;
				case 5:
					Utility.search();
					break;
				case 6:
					System.out.println("Existing");
					break;
				default:
					System.out.println("Invalid option");
				}
			} while (ch != 6);
		} catch (Exception e) {

			System.out.println("Enter choice in Integer");
		}

	}

}
