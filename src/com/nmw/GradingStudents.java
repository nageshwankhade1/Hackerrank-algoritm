package com.nmw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrade =new ArrayList<>();
        System.out.println("Round "+(grades.get(0)+4)/5*5);
        for(Integer num : grades) {
            if(num%5!=0 && (num+4)/5*5 >= 40 && Math.abs(num-(num+4)/5*5) < 3) {
                newGrade.add((num+4)/5*5);
            }
            else
                newGrade.add(num);
        }
        return newGrade;
    }

}
public class GradingStudents {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

/*        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());*/


        List<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(67);
        grades.add(40);
        grades.add(38);

        List<Integer> result = Result.gradingStudents(grades);

        for (Integer res : result){
            System.out.println(res);
        }

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );*/

       // bufferedReader.close();
       // bufferedWriter.close();
    }
}
