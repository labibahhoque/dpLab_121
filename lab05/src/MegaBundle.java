class MegaBundle extends Bundle {

    public MegaBundle(Bundle bundle1, Bundle bundle2) {

        this.name = "Mega Bundle";
        this.description = "Combines two bundles: " + bundle1.getName() + " and " + bundle2.getName();
        this.discount = 0.15;


        this.addProducts(bundle1);
        this.addProducts(bundle2);
    }
}
