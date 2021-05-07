
public class CustomerManager implements CustomerService{

	private DataBaseDao dataBaseDao;
	private LoggerService loggerService;
	
	
	public CustomerManager(DataBaseDao dataBaseDao,LoggerService loggerService) {
		super();
		this.dataBaseDao = dataBaseDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add() {
		System.out.println("Müþteri Eklendi.");
		dataBaseDao.add();
		loggerService.log();
		
	}

	@Override
	public void delete() {
		System.out.println("Müþteri Silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Müþteri Güncellendi.");
		
	}

}
