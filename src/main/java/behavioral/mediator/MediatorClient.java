package behavioral.mediator;

/**
 * Created by Administrator on 2020/8/20.
 */
public class MediatorClient extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String messgae, Person person) {
        if(person==houseOwner){
            tenant.getMessage(messgae);
        }else{
            houseOwner.getMessage(messgae);
        }
    }

    public static void main(String[] args) {
        MediatorClient client = new MediatorClient();
        HouseOwner owner = new HouseOwner("房东x",client);
        Tenant tenant = new Tenant("租客y",client);
        client.setHouseOwner(owner);
        client.setTenant(tenant);

        tenant.constact("听说有房");
        owner.constact("没有哎");

    }
}
