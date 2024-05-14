 import java.util.*;

    public class MyTestingClass {
        private int id;
        public MyTestingClass(int id){
            this.id=id;
        }
        public int getId(){
            return  id;
        }

        @Override
        public int hashCode(){
            return id;
        }
        @Override
        public boolean equals(Object anything){
            if(this == anything){
                return true;
            }
            if(this.getClass()!=anything.getClass()|| anything==null){
                return false;
            }
            MyTestingClass key=(MyTestingClass) anything;
            return id==key.getId();
        }


        static class Student {
            String name;

            public Student(String name) {
                this.name = name;
            }
        }
    }
