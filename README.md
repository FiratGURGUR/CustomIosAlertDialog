# CustomIosAlertDialog

### Usage

     exit_title.setText(R.string.exit_title); 
     exit_desc.setText(R.string.exit_desc);  

     cancel_.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogExit.cancel();
                    }
                });
     exit_.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Exit Code", Toast.LENGTH_SHORT).show();
                    }
                });



### ScreenShots 

<img src="https://github.com/FiratGURGUR/CustomIosAlertDialog/blob/master/app/src/main/res/drawable/image1.png" width="30%">





