import java.util.*;
import java.util.stream.Stream;


public class progl {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(6,5,2,8,1);
       Stream<Integer> data=numbers.stream();
       data.forEach(n->System.out.print(n+" "));
       Stream<Integer> s2=numbers.stream();
       Stream<Integer> sorteddata=s2.sorted();
       System.out.println();
       sorteddata.forEach(n->System.out.print(n+" "));

       Stream<Integer> st=numbers.stream();

       Stream<Integer> mapdata=st.map(n->n*2);
       System.out.println();

         mapdata.forEach(n->System.out.print(n+" "));

         numbers.stream()
                 .filter(n->n%2==0)

                 .forEach(n->System.out.print(n+" "));
    }

}
