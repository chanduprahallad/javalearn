package actions.demo.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = new int[6];
        marks[0] = 15; marks[1] = 18; marks[2] = 17;
        marks[3] = 14; marks[4] = 19; marks[5] = 11;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("num of elements in vowels: "+vowels.length);
        System.out.println("num of elements in marks: "+marks.length);
        System.out.println(marks[marks.length-1]);

        //array => single dimensional array.




    }

}

//Arrays will store only homogeneous elements.
//all the elements will be of same data type.

//dataType[] nameOfArray = new dataType[sizeOfArray];
//we will be adding elements based on the index.
//or
//dataType[] nameOfArray = {ele1, ele2, ele3, ele4};

//dataType[][] nameOfArray = new dataType[sizeOfRow][sizeOfColumn];
//dataType[][] nameOfArray = {{row1ele1, row1ele2, row1ele3},{row2ele1, row2ele2}};


//index => 0
//length =>how many number of elements available in the array.



