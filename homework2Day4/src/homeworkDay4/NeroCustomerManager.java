package homeworkDay4;

public class NeroCustomerManager extends BaseCustomerManager{
	
private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		super.Save(customer);
	}
}
