package uploadkatagrails

class UploadController {

    def index = { }
    
    def upload = {
    def f = request.getFile('myFile')
    if(!f.empty) {
      f.transferTo( new File('processed_files/test' + System.currentTimeMillis() + 'ms.blob') )
      flash.message = 'upload done'
      redirect(action:'index')
    }    
    else {
       flash.message = 'file cannot be empty'
       redirect(action:'index')
    }
}
}
