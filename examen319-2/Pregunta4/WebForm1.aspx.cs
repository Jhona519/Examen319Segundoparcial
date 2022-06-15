using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Mifibo
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            #Program to generate the Fibonacci Sequence till n
            double n1,n2,n3,no;
            string op = "";
            protected void page_Load(object sender, EverArgs e)
            {
            
            }
        protected void btnGenerate_Click(object sender, EverArgs e)
        {
        no = Convert.ToInt32(txtno.Text);
            no1 = 0;
            no2 = 1;
            op = "Fibonacci" +no1 + "," + no2 + ",";
            for(int i=2;i<=no;i++)
            {
            no3 = no1 +no2;
                op = no3 + ",";        
            no1 = no2;
                no2 = no3;
            }
            lblOp.Text = OpenFile;


        }


        }
    }
}