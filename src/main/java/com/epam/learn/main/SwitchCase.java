package com.epam.learn.main;

public class SwitchCase {

           /* public static int defineLevel(String role){ int level=4;
            switch (role){
                case "guest": level=0;
                break;
                case "client": level=1;
                break;
                case "moderator": level=2;
                break;
                case "admin": level=3;
                break;
                default: throw new IllegalArgumentException("non-authentic role = " + role);
            }
            return level;
            for Java>14_ver
            */
            /*public int defineLevel(String role) {
    return switch (role) {
        case "guest" -> 0;
        case "client" -> 1;
      	case "moderator" -> 2;
      	case "admin" -> 3;
      	default -> {
            System.out.println("non-authentic role = " + role);
        	yield -1;
      	}
    };
}
*/ /*public static int defineLevel(String role){
            var result = switch (role) {
                case "guest" -> 0;
                case "client" -> 1;
                case "moderator" -> 2;
                case "admin" -> 3;
                default  -> {
                    System.out.println("non-authentic role = " + role);
                    yield -1;
                }
            };
            return result;*/
           public static void main(String[] args) {
               var number = 5;
               switch (number){
                   case 1 -> number *= 2;
                   case 2 -> number *= 3;
                   case 3 -> number *= 4;
                   case 4 -> number *= 5;
                   default -> {
                       System.out.println("out of range ");
                       number += 100;
                   }
               }
               System.out.println(number);
        }

    }

