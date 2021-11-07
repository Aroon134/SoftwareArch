
import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    public void customSort(List<Person> people){
        Comparator<Person> peopleComparator = Comparator.comparing(Person::getWeight);
        people.sort(peopleComparator);
    }
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}

