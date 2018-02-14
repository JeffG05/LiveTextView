package com.jeffg.live_text_view;

import android.media.AudioAttributes;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;

import java.util.Locale;

public class LiveTextViewTTS {

    Float pitch;
    Locale language;
    Float speechRate;
    Voice voice;
    AudioAttributes audioAttributes;

    public LiveTextViewTTS() {

    }

    public LiveTextViewTTS setBuilder(Builder builder) {
        this.pitch = builder.pitch;
        this.language = builder.language;
        this.speechRate = builder.speechRate;
        this.voice = builder.voice;
        this.audioAttributes = builder.audioAttributes;
        return this;
    }



    class Builder {
        Float pitch;
        Locale language;
        Float speechRate;
        Voice voice;
        AudioAttributes audioAttributes;

        public Builder setPitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        public Builder setLanguage(Locale language) {
            this.language = language;
            return this;
        }

        public Builder setSpeechRate(float speechRate) {
            this.speechRate = speechRate;
            return this;
        }

        public Builder setVoice(Voice voice) {
            this.voice = voice;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public LiveTextViewTTS build() {
            return new LiveTextViewTTS().setBuilder(this);
        }

    }

}
