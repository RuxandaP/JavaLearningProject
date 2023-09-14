package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        // These are the steps for a new task using the Git branching strategy
        String step1 = "Execute git stash in the console";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch command - to check if there are any changes on the remote/origin";
        String step4 = "Execute git pull - this command will download the latest changes from origin/master to local master";
        String step5 = "Execute git branch New_Branch_Name command to create a new branch which is identical to the local branch";
        String step6 = "Perform git checkout New_Branch_Name - as a result we are redirected to the newly created branch";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit from the IntelliJ Idea to store the changes at a local level - on the current branch";
        String step9 = "Execute git push from Intellij Idea panel - as result, a new remote branch is created with origin/New_Branch_Name";
        String step10 = "Create a pull request from Origin/New_Branch_Name into master";
        String step11 = "Add the Pull request details like name, description and reviewers";
        String step12 = "If we collect at least 1 approval then we can merge the changes and continue with an other task";
        String step13 = "Do not forget that locally you are still on the New_Name_Branch";
        String step14 = "However, the local master does not have the latest changes, therefore perform a git fetch and git pull";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);

        }
    }