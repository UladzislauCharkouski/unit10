package com.epam.unit10.main;

public class TestOperator {

	public static void main(String[] args) {
		Customer customerVasya = new Customer(001, "Pupkin", "Vasya", "Petrovich", "Minsk,Vasina-11", 11111111, 00000001);
        Customer customerPetya = new Customer(002, "Pupkin", "Petya", "Petrovich", "Minsk,Petina-12", 22222222, 00000002);
        Customer customerValera = new Customer(003, "Pupkin", "Valera","Petrovich", "Minsk,Valerina-13", 33333333, 00000002);
        Customer customerValera1 = new Customer(003, "Pupkin", "Valera","Petrovich", "Minsk,Valerina-13", 33333333, 00000002);
        
        Student studentVasya = new Student(001, "Pupkin", "Vasya", "Petrovich", "06-07-2020", "Minsk,Vasina-11", 2111111, "FacultetVasi", 1);
        Student studentPetya = new Student(002, "Pupkin", "Petya", "Petrovich", "06-07-2020", "Minsk,Petina-12", 2222222, "FacultetPeti", 2);
        Student studentValera = new Student(002, "Pupkin", "Valera", "Petrovich", "06-07-2020", "Minsk,Valerina-13", 2333333, "FacultetValeri", 3);
        Student studentValera1 = new Student(002, "Pupkin", "Valera", "Petrovich", "06-07-2020", "Minsk,Valerina-13", 2333333, "FacultetValeri", 3);
        
        System.out.println("Testing equals/hash for class Customer");
        if(customerVasya.equals(customerPetya)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(customerVasya.equals(customerValera)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(customerPetya.equals(customerValera)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(customerValera.equals(customerValera1)){ ////must be true
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        System.out.println();
        System.out.println(customerVasya.hashCode());
        System.out.println(customerPetya.hashCode());
        System.out.println(customerValera.hashCode());
        System.out.println(customerValera1.hashCode());
        System.out.println();
        
        System.out.println("Testing equals/hash for class Student");
        if(studentVasya.equals(studentPetya)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(studentVasya.equals(studentValera)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(studentPetya.equals(studentValera)){ ////must be false
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        if(studentValera.equals(studentValera1)){ ////must be true
        	System.out.println("true");
        	} else{
        	System.out.println("false");
        }
        System.out.println();
        System.out.println(studentVasya.hashCode());
        System.out.println(studentPetya.hashCode());
        System.out.println(studentValera.hashCode());
        System.out.println(studentValera1.hashCode()); ////must be the same with studentValera
    }
}
