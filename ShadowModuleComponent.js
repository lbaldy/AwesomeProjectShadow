import React from 'react'
import {requireNativeComponent, ViewPropTypes} from 'react-native';
import PropTypes from 'prop-types';
class ShadowModuleComponent extends React.Component {

    render() {
        return <ShadowModuleView {...this.props}/>
    }

}


ShadowModuleComponent.propTypes = {

}

let ShadowModuleView = requireNativeComponent("ShadowModuleView", null);

module.exports = ShadowModuleComponent;