package com.anisio;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
	int switchStatment = 5;

	switch (switchStatment){
        case 1:
            System.out.println("Value is one");
            break;
        case 2:
            System.out.println("Value is two");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("It's a 3,4 or 5");
            break;
        default:
            System.out.println("was not one or two");
            break;
    }
    }
}
