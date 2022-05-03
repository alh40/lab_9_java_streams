package org.example.streamapi.model;

public interface Comparator {


        public static int compare(Object obj1, Object obj2) {

            Bodybuilder b1 = (Bodybuilder) obj1;
            Bodybuilder b2 = (Bodybuilder) obj2;


            if (b1.getLift() == b2.getLift()) {
                return 0;
            } else if (b1.getLift() > b2.getLift()) {
                return 1;
            } else {
                return -1;

            }
        }
    }


