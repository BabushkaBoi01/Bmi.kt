lass MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weightInput=findViewById<EditText>(R.id.weightTxt)
        var heightInput=findViewById<EditText>(R.id.heightTxt)
        var btn=findViewById<Button>(R.id.calculateBtn)
        var resulTxt=findViewById<TextView>(R.id.textview1)
       btn.setOnClickListener() {
           var heightStr = heightInput.text.toString()
           var heightInt = Integer.parseInt(heightStr)
           var heightFloat = heightInt.toFloat()
           var weightStr = weightInput.text.toString()
           var weightInt = Integer.parseInt(weightStr)
           var weightFloat = weightInt.toFloat()
           var heightMetres: Float = heightFloat / 100
           var heightMetresSquare = heightMetres * heightMetres
           var bmi = (weightFloat / heightMetresSquare) * 703
            resulTxt.text=bmi.toString()
       }
