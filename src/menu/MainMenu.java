//package menu;
//
//
//public class MainMenu {
//    public static void start(Holding holding) {
//    Scanner in = new Scanner(System.in);
//    while (true) {
//        System.out.println("Главне меню для работы с холдингом: ");
//        System.out.println("1) Вывод списка компаний в холдинге");
//        System.out.println("2) Вывод общего бюджета холдинга");
//        System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже
//                работающих сотрудников");
//                System.out.println("4) Добавление компании в холдинг");
//        System.out.println("5) Удаление компании из холдинга");
//        System.out.println("6) Меню для работы с компанией");
//        System.out.println("0) Выход из главного меню");
//        int command = in.nextInt();
//        if (command == 1) {
//            holding.showCompanies();
//        } else if (command == 2) {
//            //Реализуйте подсчет бюджета всех компаний в холдинге
//        } else if (command == 3) {
//            //Реализуйте подсчет всех работающих сотрудников и общее количестов рабочих мест во всех
//            компаниях
//            //P.S. Если в employees есть ячейка null это значит что место вакантно и там нет сотрудника
//        } else if (command == 4) {
//            //Реализуйте добавление компании в холдинг
//            //P.S. метод уже есть нужно всего лишь заполнить информацию о компании
//            holding.addCompany(new Company(null));
//        } else if (command == 5) {
//            //Реализуйте удаление компании из холдинга
//            //P.S метода нет пишите сами в классе holding ;)
//        } else if (command == 6) {
//            String companyName = in.nextLine();
//            //Реализуйте поиск компании по имени
//            //P.S. метод getCompanyByName() пустой нужно его заполнить
//            Company foundedCompany = holding.getCompanyByName(companyName);
//            CompanyMenu.start(foundedCompany);
//        } else if (command == 0) {
//            break;
//        } else {
//            System.out.println("Ошибка! Введите пункт из меню");
//        }
//    }
//}
//}
