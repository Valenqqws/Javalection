public interface Executable  {

     void execute();




        }
    class ExecutableImplementation implements Executable {
        @Override
        public void execute() {
        }
    }

        class ExecutableImplementationOffLine implements Executable {

            @Override
            public void execute() {
                System.out.println("Do something offline");
            }
        }

        class ExecutableImplementationOnline implements Executable {

            @Override
            public void execute() {
                System.out.println("Do something online");
            }
        }






