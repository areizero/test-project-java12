package com.areizero.java12.main;

public class SwitchStatements {

	public static void runSwitch() {
		System.out.println("\nSWITCH JAVA12");
		int variable = 2;
		String caseVariable;
		// tradicional
		System.out.println("|Tradicional|");
		switch (variable) {
		case 1:
			caseVariable = "Uno";
			break;
		case 2:
			caseVariable = "Dos";
			break;
		case 3:
			caseVariable = "Tres";
			break;
		default:
			caseVariable = "DEFAULT";
			break;
		}
		System.out.println("result = " + caseVariable);
		
		// Enhanced Switch, mejora de Switch mediante lambdas
		variable = 1;
		System.out.println("|Enhanced (Mejora)|");
		switch (variable) {
		case 1 -> caseVariable = "Uno";
		case 2 -> caseVariable = "Dos";
		case 3 -> caseVariable = "Tres";
		default -> caseVariable = "DEFAULT";
		}
		System.out.println("result = " + caseVariable);
		
		// Retorno mediante Break
		variable = 4;
		System.out.println("|Break Return|");
		caseVariable = switch (variable) {
		case 1 : break "Uno";
		case 2 : break "Dos";
		case 3 : break "Tres";
		default : break "DEFAULT";
		};
		System.out.println("result = " + caseVariable);
		
		// Retorno mediante reglas de etiqueta
		System.out.println("|Label Return & Multiple Case|");
		variable = 3;
		caseVariable = switch (variable) {
		case 1 -> "Uno";
		case 2 -> "Dos";
		case 3, 4, 5 -> "Tres, Cuatro, Cinco";
		default -> "DEFAULT";
		};
		System.out.println("result = " + caseVariable);
	}

}
