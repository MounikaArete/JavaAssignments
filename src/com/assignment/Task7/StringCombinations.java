package com.assignment.Task7;

public class StringCombinations {
         StringBuilder output = new StringBuilder();
          String string;
        public StringCombinations(final String str ){
            string = str;
            System.out.println("The input string  is  : " + string);
        }
        public static void main (String args[])
        {
            StringCombinations C= new StringCombinations("mouni");
            System.out.println("All possible combinations of string are :  ");
            C.combiations();
        }

        public void combiations() { combiations( 0 ); }
        private void combiations(int start ){
            for(int i = start; i < string.length(); ++i ){
                output.append( string.charAt(i) );
                System.out.println( output );
                if ( i < string.length() )
                    combiations( i + 1);
                output.setLength( output.length() - 1 );
            }
        }
}
