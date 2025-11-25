public class _3FundUserGroup extends basePage {

    public _3FundUserGroup(WebDriver driver) {
        super(driver);
    }

    private final By addUserGroupButton = By.cssSelector("button.bordered__btn");
    private final By minimumLimitInput = By.xpath("//input[@placeholder='Enter Minimum limit']");
    private final By maximumLimitInput = By.xpath("//input[@placeholder='Enter maximum limit']");
    private final By addGroupSubmit = By.xpath("//button[contains(@class,'main__btn') and normalize-space()='Add']");
    private final By addedGroupRow = By.cssSelector("#table-container tbody tr");
    private final By nextButton = By.xpath("//button[contains(@class,'main__btn') and normalize-space()='Next']");
    private final By UserGroupDDL= By.className("dropdown-search");
    private final By ForSaudiNationalityoption = By.id("soadi");
    private final By ForNonSaudiNationalityoption = By.id("residents");
    private final By all = By.id("all");


    public void addUserGroup(String userGroup, String minLimit, String maxLimit, String nationality) {
        click(addUserGroupButton);
        selectByVisibleText(UserGroupDDL, userGroup);
        sendKeys(minimumLimitInput, minLimit);
        sendKeys(maximumLimitInput, maxLimit);
        switch (nationality) {
            case "  Saudi":
                click(ForSaudiNationalityoption);
                break;
            case "Non Saudi":
                click(ForNonSaudiNationalityoption);
                break;
            case "All":
                click(all);
                break;
            default:
                throw new RuntimeException("Invalid nationality: " + nationality);
        }
        click(addGroupSubmit);
    }

    public void clickNextButton() {
        click(nextButton);
    }

   

    


}