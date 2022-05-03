package org.example.streamapi;

import org.example.streamapi.model.Bodybuilder;
import org.example.streamapi.model.Comparator;
import org.example.streamapi.model.Friend;
import org.example.streamapi.model.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Extension implements Comparator {
    /*
        Given two int numbers a and b, return int [] with values that are in the range between smaller and bigger arg:
        - use IntStream.range
        - swap the argument's values without introducing a new, local variable.
    */
    public int[] streamNumbers(int a, int b) {
        // Implement me :)

      if(a > b){
          a = a + b;
          b = a - b;
          a = a - b;
      }


        int[] numbers = IntStream.range(a, b).toArray();
        return numbers;
    }

    /*
        Given a list of users, return a User with the given user id. If there is no user with this id,
        return new user with the name "New user", given id, gender "unknown".

        (use Optional API)
    */
    public User getUserByIdOrCreateNew(List<User> users, long userId) {
        // Implement me :)

      List<User> newList = users.stream()
                .filter(i -> i.getId() == userId)
                .collect(Collectors.toList());

      if(newList.size() == 0){
          User newUser = new User(userId, "New user", User.GENDER.UNKNOWN);
          return newUser;
      }else{
          return newList.get(0);
      }
    }




    /*
        Given List<Friend>, filter the ones who are available on Saturday and want to party:
        - getAvailableDay returns "Saturday" and
        - getActivity returns "Party"
        - define predicates and use '.and' method.
    */

    public List<String> partyWithFriends(List<Friend> friends) {
        // Implement me :)

        Predicate<Friend> saturdayAndParty = i -> i.getAvailableDay().equals("Saturday") && i.getActivity().equals("Party");

                List<Friend> partyTime = friends.stream()
                        .filter(saturdayAndParty)
                                .collect(Collectors.toList());

                List<String> party = partyTime.stream()
                        .map(i -> i.getName())
                        .collect(Collectors.toList());



        return party;
    }

    /*
        Return names of sorted bodybuilders.

        Sort List<Bodybuilder> using your custom comparator.

        Write a comparator for type BodyBuilder that will sort bodybuilders by:
        - who can lift more,
        - then who is younger,
        - then name alphabetically.
     */
    public List<String> sortBodybuilders(List<Bodybuilder> bodybuilders) {
        // Implement me :)
//
//        Collections.sort(bodybuilders, (i, j) ->{
//            return i.getLift().compare(j.getLift());
//
//        }

        return null;
    }
}
