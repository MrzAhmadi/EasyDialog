# DEPRECATED THIS REPOSITORY IS NOT MAINTAINED
# EasyDialog

A library for easy programming of dialogs on Android .<br/>
Simple, with the support of Material Design
<br/><br/><br/>
![ezgif com-video-to-gif](https://user-images.githubusercontent.com/28293828/36064629-2827560a-0ea3-11e8-8ca9-3b11a6de5b4b.gif)

## Instalation ##
<br/>

### with jcenter ###
Add the dependency
```
	dependencies {
	        compile 'ir.smrahmadi:easydialog:0.0.1'
	}
```

### with jitpack ###
Step 1. Add the JitPack repository to your build file<br/>
```	
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
	dependencies {
	        compile 'com.github.smrahmadi:EasyDialog:-SNAPSHOT'
	}
```

- - - -

## How To use  ##
its Very Easy

<br/><br/>
#### for 1 item dialog : ####
<br/>

```
 easyDialog.oneItem(this,
                    "this is a Title"
                    , "This is a message",
                    R.mipmap.ic_launcher,
                    "ok",
                    new EasyDialog.showClickOneItem() {
                        @Override
                        public void Item() {
                            Toast.makeText(MainActivity.this, "click on Ok", Toast.LENGTH_SHORT).show();
                        }
                    });
                    
```
<br/><br/>

#### for 2 item dialog : ####
<br/>

```
            easyDialog.twoItem(this,
                    "This is a Title",
                    "This is a message",
                    R.mipmap.ic_launcher,
                    "yes",
                    "no",
                    new EasyDialog.showClickTwoItem() {
                        @Override
                        public void firstItem() {
                            Toast.makeText(MainActivity.this, "click on yes", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void secondItem() {
                            Toast.makeText(MainActivity.this, "click on no", Toast.LENGTH_SHORT).show();

                        }
                    });

```
<br/><br/>

#### for 3 item dialog : ####
<br/>

```
 easyDialog.threeItem(this,
                    "This is a Title",
                    "This is a message",
                    R.mipmap.ic_launcher,
                    "yes",
                    "no",
                    "cancel",
                    new EasyDialog.showClickThreeItem() {
                        @Override
                        public void firstItem() {
                            Toast.makeText(MainActivity.this, "click on yes", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void secondItem() {
                            Toast.makeText(MainActivity.this, "click on no", Toast.LENGTH_SHORT).show();

                        }

                        @Override
                        public void thirdItem() {

                            Toast.makeText(MainActivity.this, "click on cancel", Toast.LENGTH_SHORT).show();

                        }
                    });
                    
```

- - - -
##### If you do not want to have any of the parameters in your dialog, instead of the null string parameters, put 0 instead of the int parameters. #####


