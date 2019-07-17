import * as constants from '../config/constants';
import axios from 'axios';

export const fetchAll = () => {
  const url = constants.API+'stores';
  return (dispatch, getState) =>{
    axios.get(url).then((data)=>{
      dispatch(addStores(data));
    })
  }
}

export const fetchStore = (id) => {
  const url = constants.API+'store/'+id;
  return {
    type: constants.ADD_STORE,
    payload: axios.get(url)
  }
}

export const addStores = (stores) =>{
  return {
    type: constants.ADD_STORES,
    payload: stores
  }
}