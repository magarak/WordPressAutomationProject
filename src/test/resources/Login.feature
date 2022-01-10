#######TAGS########
# tags @fıtıfıtı featuredaysa tüm senaryoları çalıştırır
# tags @fıtıfıtı senaryodaysa yalnızca verilen senaryo
# tags ~@fıtıfıtı bu senaryoyu çalıştırma git diğer hepsinden devam et
# tags @fıtıtı tags @fıt --AND operation kesişimi alır
# tags @fıtıfıtı,@fıt --OR operation toplamı bunu ya da bunu

#####HOOKS########
#hooks are blocks of code that can run at various points in the Cucumber execution cycle
# Before Hook - before every scenario is executed
# BackGround - is execute before every scenario
#Before Hook --> Background --> scenario 1--After Hook
#Before Hook --> Background --> scenario 2--After Hook

#examplesla aynı senaryo içersinde birden fazla data ile senaryo koşmaca--> Data Driven Concept
#
#####SELENIUM########
#  web app automation tool--> not for stand alones(desktop app) or mobile app
#####features######
#    open source- free
#    supports any kinda browsers -firefox,chrome,opera,IE
#    supports lots of programming lang -JAVA,C#,Pyhton, Ruby, Obj-C...
#    supports platforms - Windows Linux MAc
#
#####components######
#Selenium GRID --> is used to run multiple test across different browsers, operating systems, and machines in parallel
#Selenium Web Driver-->is advanced than selenium RC, and it has st of libraries in java for automating web app
#Selenium Remote controller --> has set of libraries in java,used for automating web app (x)
#Selenium IDE --> firefox plugin which is used for record and play back user actions(that can be saved and pşayed back)


Feature: Test Login Feature

  Scenario Outline: Test login functionality with valid credentials
    Given open wordpress application
    When click on login link
    Then login page should appear
    When enter user name <userName>
    When click on continue button
    When enter password <password>
    When click on login button
    Then login should be successful
                Examples:
                        | userName | password |
                        | "merve"  | "agarak" |
                        | "cem"  | "agarak" |