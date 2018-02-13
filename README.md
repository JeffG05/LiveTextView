# LiveTextView
Android Library to display text while it is being spoken

[ ![Download](https://api.bintray.com/packages/jeffg05/Live-Text-View/Live-Text-View/images/download.svg?version=1.0.0) ](https://bintray.com/jeffg05/Live-Text-View/Live-Text-View/1.0.0/link) [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)


## Getting Started

### First
Enter this in your build.gradle (Project)

```
allprojects {
    repositories {
        maven {
            url "https://dl.bintray.com/jeffg05/Live-Text-View"
        }
    }
}
```

### Then

Follow one of these steps to import Live-Text-View into your project:


### Gradle

```
implementation 'com.jeffg.live_text_view:live-text-view:1.0.1'
```

### Maven

```
<dependency>
  <groupId>com.jeffg.live_text_view</groupId>
  <artifactId>live-text-view</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

### Ivy

```
<dependency org='com.jeffg.live_text_view' name='live-text-view' rev='1.0.1'>
  <artifact name='live-text-view' ext='pom' />
</dependency>
```

## Implementing into your project

### Add XML
```
<com.jeffg.live_text_view.LiveTextView
      android:id="@+id/liveTextView"
      android:layout_width="match_parent"
      android:layout_height="match_parent"/>
```

### Initialise LiveTextView
```
LiveTextView liveTextView = (LiveTextView) findViewById(R.id.liveTextView);
liveTextView.setText(Text);
liveTextView.start();
```

## License

```
Copyright 2018 Jeff Gugelmann

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
