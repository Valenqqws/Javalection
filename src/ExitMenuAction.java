public class ExitMenuAction implements MenuAction {


    @Override
    public void execute() {System.exit(0);}

    @Override
    public String getName() {return "Exit program";}
}