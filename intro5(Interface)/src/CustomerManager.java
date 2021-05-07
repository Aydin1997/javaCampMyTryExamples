
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
		System.out.println("M��teri Eklendi.");
		dataBaseDao.add();
		loggerService.log();
		
	}

	@Override
	public void delete() {
		System.out.println("M��teri Silindi");
		
	}

	@Override
	public void update() {
		System.out.println("M��teri G�ncellendi.");
		
	}

}
