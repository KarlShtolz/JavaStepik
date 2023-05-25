package c_exception_4.logging;
/**
 * Вам необходимо описать набор классов, каждый из которых является MailService:
 * 1) UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать
 * почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц, а затем,
 * в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. У UntrustworthyMailWorker
 * должен быть конструктор от массива MailService ( результат вызова processMail первого элемента массива передается
 * на вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку на внутренний
 * экземпляр RealMailService.
 * 2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется
 * от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса
 * MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения
 * полей почты):
 * 2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем
 * WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 * 2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
 * 3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
 * переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
 * присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
 * Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с
 * нулевой ценностью и содержимым посылки "stones instead of {content}".
 * 4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
 * если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из
 * камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны
 * объявить самостоятельно в виде непроверяемых исключений.
 * Все классы должны быть определены как публичные и статические, так как в процессе проверки ваш код будет подставлен
 * во внешний класс, который занимается тестированием и проверкой структуры. Для удобства во внешнем классе объявлено
 * несколько удобных констант и импортировано все содержимое пакета java.util.logging. Для определения, посылкой или
 * письмом является Sendable объект воспользуйтесь оператором instanceof.
 */
//public static class UntrustworthyMailWorker implements MailService {
//    private final MailService realMailService = new RealMailService();
//    private MailService[] mailServices;
//    public UntrustworthyMailWorker(MailService[] services){
//        mailServices = services;
//    }
//
//    public MailService getRealMailService(){
//        return realMailService;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        Sendable processed = mail;
//        for (int i = 0; i < mailServices.length; i++) {
//            processed = mailServices[i].processMail(processed);
//        }
//        return realMailService.processMail(mail);
//    }
//}
//
//public static class Spy implements MailService {
//    private Logger LOGGER;
//    public Spy(Logger logger) {
//        LOGGER = logger;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if(mail.getClass() == MailMessage.class) {
//            MailMessage mailMessage = (MailMessage) mail;
//            String from = mailMessage.getFrom();
//            String to = mailMessage.getTo();
//            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
//                LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
//            } else {
//                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
//            }
//        }
//        return mail;
//    }
//}
//
//public static class Thief implements MailService {
//    private int minPrice = 0;
//    private int stolenPrice = 0;
//    public Thief(int minPrice){
//        this.minPrice = minPrice;
//    }
//    public int getStolenValue(){
//        return stolenPrice;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if(mail.getClass() == MailPackage.class) {
//            Package pac = ((MailPackage)mail).getContent();
//            if(pac.getPrice() >= minPrice){
//                stolenPrice += pac.getPrice();
//                mail = new MailPackage(mail.getFrom(), mail.getTo(),new Package("stones instead of " + pac.getContent(), 0));
//            }
//        }
//        return mail;
//    }
//}
//
//public static class IllegalPackageException extends RuntimeException {}
//public static class StolenPackageException extends RuntimeException {}
//public static class Inspector implements MailService {
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if(mail.getClass() == MailPackage.class) {
//            Package pac = ((MailPackage)mail).getContent();
//            String content = pac.getContent();
//            if(content.indexOf("stones instead of ") == 0) {
//                throw new StolenPackageException();
//            } else if(content.equals(WEAPONS) || content.equals(BANNED_SUBSTANCE)){
//                throw new IllegalPackageException();
//            }
//        }
//        return mail;
//    }
//}