/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import { Platform, StyleSheet, Text, View, KeyboardAvoidingView,TextInput ,ScrollView, Keyboard} from 'react-native';
import ShadowModuleComponent from './ShadowModuleComponent';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
  android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class App extends Component<Props> {

constructor(){
  super();
  this.state = {
    bounces: true
  }
  this.keyboardDidHideListener = Keyboard.addListener('keyboardDidHide', this._keyboardDidHide.bind(this));
  this.keyboardDidShowListener = Keyboard.addListener('keyboardDidShow', this._keyboardDidShow.bind(this));
}

_keyboardDidShow(){
  // this.setState({bounces: false});
}

_keyboardDidHide(){
  // this.setState({bounces: true});
}

  render() {
    return (
      <View style={{backgroundColor: 'red', flex: 1}}>
        <View style={{backgroundColor: 'blue', flex:1}}>
          <ShadowModuleComponent style={{flex:1, backgroundColor: 'green'}}/>
        </View>
        <View style={{backgroundColor: 'yellow', flex:1}}>
          <Text>Empty</Text>
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: 350,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});
