/*
   Programmed by Sergii Kozhushko 2022
   Date of creation: 20-Nov-2022 
*/

public class ArraysMore {
    private static int stringCompare(String s1, String s2){
        //метод сравнивает две строки по алфавиту. Если первая строка раньше по алфавиту,
        // то возвращает 1, если вторая 2, если равны, то 0
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int i=0;
        while (i < (s1.length()>s2.length()? s2.length() : s1.length())) {
             if (s1.charAt(i) != s2.charAt(i)) {
                 if (s1.charAt(i) > s2.charAt(i)) return 2;
                 else return 1;
             }
             i++;

        }
        return 0;

    }
    private static String[] sortStringArray(String [] arrayString){
        //метод сортирует массив строк
        boolean areWeFinished = false;
        String str1, str2;
        while (!areWeFinished) {
            areWeFinished = true;
            for (int i = 0; i < arrayString.length-1; i++) {
                if (stringCompare(arrayString[i], arrayString[i+1])==2) {
                    // если мы нашли несортированные элементы, то
                    // поменять их местаим и следует начать проверку массива сначала
                    str1 = arrayString[i];
                    arrayString[i] = arrayString[i+1];
                    arrayString[i+1] = str1;
                    areWeFinished = false;
                }
            }
        }
        return arrayString;
    }



    public static void main(String[] args) {
        String[] str = {"ypsilon", "aa", "cat", "dog", "Bibop", "oma"};

        for (String i : sortStringArray(str)){
            System.out.print(i+" ");
        }

    }
}
