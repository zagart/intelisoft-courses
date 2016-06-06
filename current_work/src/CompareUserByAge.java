/**
 * Created by intelisoft on 06.06.2016.
 */
public class CompareUserByAge implements ComparableUser {

    @Override
    public int compare(User a, User b) {
        return b.getAge() - a.getAge();
    }

}
