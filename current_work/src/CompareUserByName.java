/**
 * Created by intelisoft on 06.06.2016.
 */
public class CompareUserByName implements ComparableUser {

    @Override
    public int compare(User a, User b) {

        return a.getLogin().compareToIgnoreCase(b.getLogin());

    }

}
