package model;

public class EditPoiActivity extends Activity  {

	public Button btnSavePos;
	
	public Integer testProperty1;
	


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.editPoiActivity);
		
		btnSavePos.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				org.eclipse.emf.ecore.impl.DynamicEObjectImpl@ecb973 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@18360c8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) poiDesc;
				Integer testPropertyBtn1;
				org.eclipse.emf.ecore.impl.DynamicEObjectImpl@ecb973 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@18360c8 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) poiName;
				// TODO: implement stuff			
			}
		});
		
		
	}

	
	public void testOperation1() {
		// TODO: Add your code here
		
	}
	
	private void testOperation2() {
		// TODO: Add your code here
		
	}


}
