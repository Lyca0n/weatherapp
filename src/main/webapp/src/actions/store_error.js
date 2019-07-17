import * as constants from '../config/constants';
import axios from 'axios';

export const fetchAll = () => {
  const url = constants.API+'errors';
  return (dispatch, getState) =>{
    axios.get(url).then((data)=>{
      dispatch(addStoreErrors(data));
    })
  }
}

export const addStoreErrors = (errors) =>{
  return {
    type: constants.ADD_STORE_ERRORS,
    payload: errors
  }
}