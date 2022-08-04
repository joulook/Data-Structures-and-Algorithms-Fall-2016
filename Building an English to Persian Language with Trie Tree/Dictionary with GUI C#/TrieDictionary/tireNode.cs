using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrieDictionary
{
    class trieNode
    {
        public trieNode[] leaf;
        public string mng;
       public  Boolean End = false;
        public trieNode()
        {
            this.leaf = new trieNode[26];
        }
    }
}
