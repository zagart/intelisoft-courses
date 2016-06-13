import java.util.Comparator;

/**
 * Created by intelisoft on 06.06.2016.
 */

public interface ComparableUser extends Comparator<User> {

    int compare(User user1, User user2);

}
