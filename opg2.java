package ch11;

import java.util.LinkedList;
import java.util.List;

/* Write a method called alternate that accepts two opg2 as its parameters and returns a new opg1comma2 containing alter-
nating elements from the two lists, in the following order:

• First element from first list
• First element from second list
• Second element from first list
• Second element from second list
• Third element from first list
• Third element from second list
• . . .
If the lists do not contain the same number of elements, the remaining elements from the longer list should be
placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8,
4, 9, 5, 10, 11, 12]. */
public class opg2
{
    public static void main(String[] args)
    {
        List<Integer> alternated = new LinkedList<>();
        List<Integer> alternated1 = new LinkedList<>();
        alternated.add(1);
        alternated.add(2);
        alternated.add(3);
        alternated1.add(8);
        alternated1.add(9);
        alternated1.add(10);
        alternated1.add(11);

        System.out.println(alternate(alternated, alternated1));
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
    {
        // Creating a new list
        List<Integer> list = new LinkedList<Integer>();

        int numbers1 = 0;
        int numbers2 = 0;

        int size1 = list1.size();
        int size2 = list2.size();

        boolean yayOrNay = true;


        while (numbers1 < size1 || numbers2 < size2)
        {
            if (numbers1 < size1 && yayOrNay)
            {
                list.add(list1.get(numbers1));
                 numbers1++;
            } else if (numbers2 < size2 && !yayOrNay)
            {
                list.add(list2.get(numbers2));
                numbers2++;
            }
            yayOrNay = !yayOrNay;
        }

        return list;
    }
}

