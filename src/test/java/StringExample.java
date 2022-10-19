public class StringExample {
    public void stringManipulation(String input)
    {
        String s1="prahallad";
        String s3 = "CHANDU";
      char[] str = input.toCharArray();
      for(int i=str.length-1;i>=0;i--)
      {
          System.out.print(str[i]);
      }

        System.out.println();
        System.out.println();

        //comparing two strings
        if(input.equalsIgnoreCase(s3))
            System.out.println(input +"  equals "+ s3);
        else
            System.out.println(input +"  not equals "+ s3);

      //to upperCase and To lowerCase
        System.out.println(input.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println();
        System.out.println();


        //finding length
        System.out.println(s1.length());

      //finding character at index position
        System.out.println();
        System.out.println(s1.charAt(4));

      //finding compare two Strings
        String s4 = s3.toLowerCase();
        System.out.println("s4 string to lower case : "+input.compareTo(s4));
        System.out.println();


        //finding index of character
        System.out.println("Index of 'D' in s3 String : "+s3.indexOf("D"));
        System.out.println();


        //using contains
        System.out.println("does s1 string contain character 'x': "+ s1.contains("x"));
        System.out.println();


        //using last index of
        System.out.println("last index of 'a' in s1 string is : "+s1.lastIndexOf("a"));
        System.out.println("last index of 'a' from index from '3' : "+s1.lastIndexOf("a",3));
        System.out.println("index of 'a' from index position '4' : "+s1.indexOf("a",4));
        System.out.println();


        //using endsWith
        System.out.println("Is s1 string ending with 'ad' : "+ s1.endsWith("ad"));
        System.out.println();


        //using startsWith
        System.out.println("does s3 Starts with 'C' with index '0' : "+ s3.startsWith("C",0));
        System.out.println();


        //checking whether string s3 is empty
        System.out.println("Is s3 string is empty : "+ s3.isEmpty());
        System.out.println();

        //using concatenation
        System.out.println(s3.concat("is learning java with selenium"));
        System.out.println();


        //compare to with equals ignore case
        System.out.println(s1.compareToIgnoreCase(input));
        System.out.println();


        //substring
        System.out.println("substring for "+input+" with starting index '4' and ending index '6' : "+ input.substring(4,6));
        System.out.println();


        //split the string
        String s5 = "  im now learning java strings   ";
        System.out.println("splitting the string : "+ s5.split("//s"));
        System.out.println();


        //trim
        String s7 = s5.trim();
        System.out.println("trimmed string : " +s7);
        System.out.println();

        // checking whether s5 string is blank
        System.out.println("is s5 string blank : "+s5.isBlank());
        System.out.println();

        //strip
        System.out.println("strip s5 string : "+s5.strip());
        System.out.println();

        //
        System.out.println("using codepoint : "+s5.codePointAt(5));
        System.out.println();

        //replaced characters
        System.out.println("replacing new characters : " +s5.replace("im","I am"));
        System.out.println();

        //
        System.out.println(s5.chars());
        System.out.println();

        //
        System.out.println(s5.contentEquals(s7));











    }
}
